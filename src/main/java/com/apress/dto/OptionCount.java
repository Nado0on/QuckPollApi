package com.apress.dto;

public class OptionCount {
    public OptionCount(Long optionId, int count) {
        this.optionId = optionId;
        this.count = count;
    }

    public OptionCount() {
    }

    private Long optionId;
    private int count;

    public Long getOptionId() {
        return optionId;
    }

    public void setOptionId(Long optionId) {
        this.optionId = optionId;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
