package com.hansbiotech.kr.awsimage_upload.models;

import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

public class UserProfile {
    private final UUID userProfileId;
    private final String username;
    private String userProfileImageLink;    //S3 Key

    public UserProfile(UUID userProfileId, String username, String userProfileImageLink) {
        this.userProfileId = userProfileId;
        this.username = username;
        this.userProfileImageLink = userProfileImageLink;
    }

    public UUID getUserProfileId() {
        return userProfileId;
    }

    public String getUsername() {
        return username;
    }

    public Optional<String> getUserProfileImageLink() {
        return Optional.ofNullable(userProfileImageLink);
    }

    public void setUserProfileImageLink(String userProfileImageLink) {
        this.userProfileImageLink = userProfileImageLink;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserProfile that)) return false;
        return Objects.equals(getUserProfileId(), that.getUserProfileId()) && Objects.equals(getUsername(), that.getUsername()) &&
                Objects.equals(getUserProfileImageLink(), that.getUserProfileImageLink());  //Object.equals provide an auto null check
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserProfileId(), getUsername(), getUserProfileImageLink());
    }
}
