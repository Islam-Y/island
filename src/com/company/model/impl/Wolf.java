package com.company.model.impl;

import com.company.dto.LiveableConfig;
import com.company.model.Fauna;
import com.company.model.enums.LiveableType;

import static com.company.model.enums.LiveableType.WOLF;

public class Wolf extends Fauna {

    public Wolf(LiveableConfig liveableConfig) {
        super(liveableConfig);
    }

    @Override
    public LiveableType getLiveableType() {
        return WOLF;
    }
}
