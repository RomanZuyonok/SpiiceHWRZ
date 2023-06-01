package com.example.spiicehwrz.ui.addMessage

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.widget.doAfterTextChanged
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.spiicehwrz.R
import com.example.spiicehwrz.utilities.getString
import com.example.spiicehwrz.databinding.FragmentAddNoteBinding
import com.example.spiicehwrz.model.MessageUser
import com.example.spiicehwrz.validations.ValidationResult
import com.example.spiicehwrz.validations.titleValidation
import java.util.*

class AddNoteFragment : Fragment() {

    private val viewModel: AddMessageViewModel by viewModels()

    private lateinit var binding: FragmentAddNoteBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAddNoteBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.run {
            messageSaved = {
                Toast.makeText(requireContext(), R.string.toast_msg_add, Toast.LENGTH_LONG).show()
                parentFragmentManager.popBackStack()
            }

            showTitleError={
                binding.tFieldTitle.error = requireContext().getString(R.string.title_exist)
            }
        }

        binding.buttonAddMsg.setOnClickListener{
            if(isValidate()){
                addMessage()
            }
        }

        binding.messageEditText.doAfterTextChanged { isValidate() }

    }

    private fun isValidate() : Boolean{
        val titleValidationResult = titleValidation(binding.tFieldTitle.toString().trim())
        when(titleValidationResult){
            is ValidationResult.Invalid -> binding.tFieldTitle.error =
                requireContext().getString(titleValidationResult.errorId)
            else -> binding.addNoteTextView.error = null
        }
        val isValid = titleValidationResult == ValidationResult.Valid
        binding.buttonAddMsg.isEnabled = isValid
        return isValid
    }

    private fun addMessage() {
        viewModel.addNewMessage(
            MessageUser(
                binding.tFieldTitle.toString().trim(),
                binding.tFieldMessage.toString().trim(),
                Date()
            )
        )
    }

    companion object {
        const val TAG = "AddNoteFragment"
    }

}