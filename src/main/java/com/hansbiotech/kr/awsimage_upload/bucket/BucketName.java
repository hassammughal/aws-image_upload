package com.hansbiotech.kr.awsimage_upload.bucket;

public enum BucketName {

    PROFILE_IMAGE("springboot-demos-image-upload");

    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
