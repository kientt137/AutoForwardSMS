package com.ttk.lab.autoforwardsms.presentation.home;

import com.ttk.lab.autoforwardsms.presentation.BaseView;

public interface IHomeView extends BaseView {

    void updateChatID(String chat_id);

    void showLoading(boolean loading);

    void showErrorToken(String content);

    void showPhoneValid(boolean isValid);
}
