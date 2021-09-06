package com.hansbiotech.kr.awsimage_upload.datastore;

import com.hansbiotech.kr.awsimage_upload.models.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {
    private static final List<UserProfile> USER_PROFILE_LIST = new ArrayList<>();
    static {
        USER_PROFILE_LIST.add(new UserProfile(UUID.fromString("aee98f70-83bc-429d-9ac6-c24d2b962431"),"Hassam", null));
        USER_PROFILE_LIST.add(new UserProfile(UUID.fromString("c22c03f3-9bd5-4b6a-bad6-0890edb474f7"), "Anum", null));
    }
    public List<UserProfile> getUserProfiles() {
        return USER_PROFILE_LIST;
    }
}
