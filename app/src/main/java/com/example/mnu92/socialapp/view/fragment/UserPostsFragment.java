package com.example.mnu92.socialapp.view.fragment;

import com.google.firebase.database.Query;

public class UserPostsFragment extends PostsFragment {
    @Override
    Query setQuery() {
        return mReference.child("posts/user-posts").child(mUser.getUid());
    }
}
