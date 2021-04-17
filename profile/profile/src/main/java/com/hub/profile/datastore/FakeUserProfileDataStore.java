package com.hub.profile.datastore;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.hub.profile.profile.UserProfile;

@Repository
public class FakeUserProfileDataStore {

    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile("2aeb885d-8630-4880-b4a3-e83aaa8f6a80", "Johnson", null));
        USER_PROFILES.add(new UserProfile("9e54dfd9-2901-41c1-9c6d-799d21df0a84", "Britto", null));
    }

    public List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }

}
