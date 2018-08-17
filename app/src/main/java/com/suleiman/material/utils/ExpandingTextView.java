package com.suleiman.material.utils;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.view.View;

import com.suleiman.material.R;


public class ExpandingTextView extends AppCompatTextView implements View.OnClickListener {

    private int mCollapsedMaxLines;
    private boolean mExpanded;

    private OnClickListener mDelegateClickListener;
    private AppCompatTextView tvReadMore;

    public ExpandingTextView(Context context) {
        this(context, null);
    }

    public ExpandingTextView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ExpandingTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);

        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.ExpandingTextView, 0 , defStyle);
        mCollapsedMaxLines = a.getInt(R.styleable.ExpandingTextView_collapsed_maxLines, 8);
        a.recycle();

        if (mExpanded) {
            expand();
        } else {
            collapse();
        }

        super.setOnClickListener(this);
    }

    public void expand() {
        setMaxLines(Integer.MAX_VALUE);
        mExpanded = true;
    }

    public void collapse() {
        setMaxLines(mCollapsedMaxLines);
        mExpanded = false;
    }

    public void toggle(){
        if (mExpanded) {
            tvReadMore.setText("Read More");
            collapse();
        } else {
            tvReadMore.setText("Read Less");
            expand();
        }
    }

    @Override
    public void setOnClickListener(OnClickListener l) {
        mDelegateClickListener = l;
    }

    @Override
    public final void onClick(View v) {
        if (mExpanded) {
            collapse();
        } else {
            expand();
        }

        if (mDelegateClickListener != null) {
            mDelegateClickListener.onClick(v);
        }
    }

    public void setReadMoreBtnView(AppCompatTextView tvReadMore){
        this.tvReadMore = tvReadMore;
    }
}