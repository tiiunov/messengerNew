package com.example.messengernew.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import com.example.messengernew.R
import com.example.messengernew.databinding.ActivityRegisterBinding
import com.example.messengernew.ui.fragments.EnterPhoneNumberFragment
import com.example.messengernew.utils.changeFragment

class RegisterActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityRegisterBinding
    private lateinit var mToolBar: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
    }

    override fun onStart() {
        super.onStart()
        mToolBar = mBinding.registerToolBar
        setSupportActionBar(mToolBar)
        title = getString(R.string.register_title_our_phone)
        changeFragment(EnterPhoneNumberFragment())
    }
}