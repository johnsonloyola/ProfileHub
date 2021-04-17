package com.hub.profile.bucket;

public enum BucketName {
	
	BUCKET_NAME("profileshub");
	
	public final String bucketName;

	private BucketName(String bucketName) {
		this.bucketName = bucketName;
	}

	public String getBucketName() {
		return bucketName;
	}
	
}
