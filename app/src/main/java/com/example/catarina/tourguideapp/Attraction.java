package com.example.catarina.tourguideapp;

/**
 * {@link Attraction} represents a sight/place name and description that the user wants to learn.
 * It contains resource IDs for the name,  description and
 * optional image file for that item.
 */

public class Attraction {

    /**
     * Constant value that represents no image was provided for this item
     */
    private static final int NO_IMAGE_PROVIDED = -1;
    /**
     * String resource ID for the name of the attraction
     */
    private int mAttractionNameId;
    /**
     * String resource ID for the attractions description
     */
    private int mDescriptionId;
    /**
     * Image resource ID for the item
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Create a new item object.
     *
     * @param attractionNameId is the string resource ID for name of the attraction
     * @param descriptionId    is the string resource ID for the attraction description
     */
    public Attraction(int attractionNameId, int descriptionId) {
        mAttractionNameId = attractionNameId;
        mDescriptionId = descriptionId;

    }

    /**
     * Create a new item object.
     *
     * @param attractionNameId is the string resource ID for the attractions name
     * @param descriptionId    is the string resource Id for the attractions description
     * @param imageResourceId  is the drawable resource ID for the image associated with the item
     */
    public Attraction(int attractionNameId, int descriptionId, int imageResourceId) {
        mAttractionNameId = attractionNameId;
        mDescriptionId = descriptionId;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the string resource ID for the attractions name.
     */
    public int getAttractionNameId() {
        return mAttractionNameId;
    }

    /**
     * Get the string resource ID for the attractions description.
     */
    public int getDescriptionId() {
        return mDescriptionId;
    }

    /**
     * Return the image resource ID of the attraction.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this attraction.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}