package Models;

import android.widget.ImageView;

public class DataModel
{
    String TOPIC_NAME;
    String TOPIC_DESCRIPTION;
    String IMAGE_SRC;
    int PROFILE_IMAGE;

    public DataModel(String TOPIC_NAME, String TOPIC_DESCRIPTION, String IMAGE_SRC) {
        this.TOPIC_NAME = TOPIC_NAME;
        this.TOPIC_DESCRIPTION = TOPIC_DESCRIPTION;
        this.IMAGE_SRC = IMAGE_SRC;
    }

    public DataModel(String TOPIC_NAME, String TOPIC_DESCRIPTION, int PROFILE_IMAGE) {
        this.TOPIC_NAME = TOPIC_NAME;
        this.TOPIC_DESCRIPTION = TOPIC_DESCRIPTION;
        this.PROFILE_IMAGE = PROFILE_IMAGE;
    }

    public String getTOPIC_NAME() {
        return TOPIC_NAME;
    }

    public void setTOPIC_NAME(String TOPIC_NAME) {
        this.TOPIC_NAME = TOPIC_NAME;
    }

    public int getPROFILE_IMAGE() {
        return PROFILE_IMAGE;
    }

    public void setPROFILE_IMAGE(int PROFILE_IMAGE) {
        this.PROFILE_IMAGE = PROFILE_IMAGE;
    }

    public String getTOPIC_DESCRIPTION() {
        return TOPIC_DESCRIPTION;
    }

    public void setTOPIC_DESCRIPTION(String TOPIC_DESCRIPTION) {
        this.TOPIC_DESCRIPTION = TOPIC_DESCRIPTION;
    }

    public String getIMAGE_SRC() {
        return IMAGE_SRC;
    }

    public void setIMAGE_SRC(String IMAGE_SRC) {
        this.IMAGE_SRC = IMAGE_SRC;
    }
}
