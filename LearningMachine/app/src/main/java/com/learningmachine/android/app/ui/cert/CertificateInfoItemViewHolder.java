package com.learningmachine.android.app.ui.cert;

import androidx.recyclerview.widget.RecyclerView;

import com.learningmachine.android.app.databinding.CertificateInfoItemBinding;

public class CertificateInfoItemViewHolder extends RecyclerView.ViewHolder {
    private final CertificateInfoItemBinding mBinding;

    public CertificateInfoItemViewHolder(CertificateInfoItemBinding binding) {
        super(binding.getRoot());
        mBinding = binding;
    }

    public void bind(CertificateInfoItemViewModel viewModel) {
        mBinding.setItem(viewModel);
    }
}
