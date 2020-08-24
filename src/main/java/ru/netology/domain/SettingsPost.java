
package ru.netology.domain;

public class SettingsPost {
    private boolean disableComments;
    private boolean addSignature;
    private boolean disableNotifications;
    private boolean advertisement;

    public boolean isDisableComments() {
        return disableComments;
    }

    public void setDisableComments(boolean disableComments) {
        this.disableComments = disableComments;
    }

    public boolean isAddSignature() {
        return addSignature;
    }

    public void setAddSignature(boolean addSignature) {
        this.addSignature = addSignature;
    }

    public boolean isDisableNotifications() {
        return disableNotifications;
    }

    public void setDisableNotifications(boolean disableNotifications) {
        this.disableNotifications = disableNotifications;
    }

    public boolean isAdvertisement() {
        return advertisement;
    }

    public void setAdvertisement(boolean advertisement) {
        this.advertisement = advertisement;
    }
}