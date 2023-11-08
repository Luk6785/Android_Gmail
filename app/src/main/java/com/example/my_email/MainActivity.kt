package com.codingdemos.mymail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.my_email.EmailData
import com.example.my_email.MailAdapter
import com.example.my_email.R

class MainActivity : AppCompatActivity() {
    private var mToolbar: androidx.appcompat.widget.Toolbar? = null
    private var mRecyclerView: RecyclerView? = null
    private var mEmailData: MutableList<EmailData> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mToolbar = findViewById(R.id.toolbar)
        mToolbar?.setTitle(R.string.app_name)

        mRecyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        val mLinearLayoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        mRecyclerView?.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
        mRecyclerView?.layoutManager = mLinearLayoutManager

        var mEmail = EmailData(
            "Sam", "Weekend adventure",
            "Let's go fishing with John and others. We will do some barbecue and have soo much fun",
            "10:42am"
        )
        mEmailData.add(mEmail)

        mEmail = EmailData(
            "Facebook", "James, you have 1 new notification",
            "A lot has happened on Facebook since",
            "16:04pm"
        )
        mEmailData.add(mEmail)

        mEmail = EmailData(
            "Google+", "Top suggested Google+ pages for you",
            "Top suggested Google+ pages for you",
            "18:44pm"
        )
        mEmailData.add(mEmail)

        mEmail = EmailData(
            "Twitter", "Follow T-Mobile, Samsung Mobile U",
            "James, some people you may know",
            "20:04pm"
        )
        mEmailData.add(mEmail)

        mEmail = EmailData(
            "Pinterest Weekly", "Pins you’ll love!",
            "Have you seen these Pins yet? Pinterest",
            "09:04am"
        )
        mEmailData.add(mEmail)

        mEmail = EmailData(
            "Josh", "Going lunch", "Don't forget our lunch at 3PM in Pizza hut",
            "01:04am"
        )
        mEmailData.add(mEmail)

        val mMailAdapter = MailAdapter(this, mEmailData)
        mRecyclerView?.adapter = mMailAdapter
    }
}
