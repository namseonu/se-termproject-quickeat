package com.se.termproject.ui.main.history

import com.se.termproject.base.kotlin.BaseFragment
import com.se.termproject.databinding.FragmentHistoryBinding
import com.se.termproject.ui.customer.history.Store

class HistoryFragment : BaseFragment<FragmentHistoryBinding>(FragmentHistoryBinding::inflate) {
    private var storeData = ArrayList<Store>()

    private lateinit var histroyRVAdapter: HistoryRVAdapter

    override fun initAfterBinding() {
        initStore()
        initRecyclerView()
        binding()
    }

    //store data 초기화 - firebase 연동 후 구현
    private fun initStore(){

    }

    //RecyclerView 초기화
    private fun initRecyclerView(){
        //histroyRVAdapter = HistoryRVAdapter()
        //histroyRVAdapter.addData()
    }

    //필수는 아닌데
    private fun binding(){

    }
}