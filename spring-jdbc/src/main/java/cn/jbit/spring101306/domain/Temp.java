package cn.jbit.spring101306.domain;

public class Temp {
    private Integer tempId;
    private String tempName;

    public Temp(Integer tempId, String tempName) {
        this.tempId = tempId;
        this.tempName = tempName;
    }

    public Temp() {
    }

    @Override
    public String toString() {
        return "Temp{" +
                "tempId=" + tempId +
                ", tempName='" + tempName + '\'' +
                '}';
    }

    public Integer getTempId() {
        return tempId;
    }

    public void setTempId(Integer tempId) {
        this.tempId = tempId;
    }

    public String getTempName() {
        return tempName;
    }

    public void setTempName(String tempName) {
        this.tempName = tempName;
    }
}
