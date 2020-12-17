package com.cookandroid.hey_bob_ver7.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ListView;

import android.graphics.drawable.Drawable;
import android.widget.Toast;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.ListFragment;

import com.cookandroid.hey_bob_ver7.R;

public class HomeFragment extends ListFragment {

    ListViewAdapter adapter ;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Adapter 생성 및 Adapter 지정.
        adapter = new ListViewAdapter() ;
        setListAdapter(adapter) ;


        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.ic_macdonald),
                "맥도날드", "함께배달주문/+1인/아이파크 정문") ;
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.ic_costco),
                "코스트코 도넛", "함께구매/+1인/동작구 상도 1길") ;
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.ic_yeopgittoekbokki),
                "엽기떡볶이", "함께배달주문/+4인/숭실대 레지던스홀") ;
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.ic_gsshop),
                "GS 홈쇼핑 여성 터틀넥", "함께구매/+4인/노량진") ;
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.ic_homeplus),
                "홈플러스 계란", "함께구매/+2인/이수") ;
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.ic_yugane),
                "유가네 닭갈비", "함께배달주문/+2인/숭실대 레지던스홀") ;
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.ic_ssamrice),
                "백종원의 원조쌈밥집", "함께배달주문/+3인/자이 아파트") ;
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.ic_dumpling),
                "명인만두", "함께배달주문/+1인/푸르지오 정문") ;

        return super.onCreateView(inflater, container, savedInstanceState);
    }


    @Override
    public void onListItemClick (ListView l, View v, int position, long id) {
        // get TextView's Text.
        ListViewItem item = (ListViewItem) l.getItemAtPosition(position) ;

        String titleStr = item.getTitle() ;
        String descStr = item.getDesc() ;
        Drawable iconDrawable = item.getIcon() ;

    }

    public void addItem(Drawable icon, String title, String desc) {
        adapter.addItem(icon, title, desc) ;
    }

}