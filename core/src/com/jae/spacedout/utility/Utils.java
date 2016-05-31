package com.jae.spacedout.utility;

public class Utils
{
    /** Maps a number from one range to another
     * @param inStart low value of input range
     * @param inEnd high value of input range
     * @param outStart low value of output range
     * @param outEnd high value of output range
     * @param inValue value in terms of input range
     * @return value in terms of output range
     */
    public static float mapRange(float inStart, float inEnd, float outStart, float outEnd, float inValue)
    {
        return outStart + ((inValue - inStart) * (outEnd - outStart)) / (inEnd - inStart);
    }

    /** Returns an angle from 0 to 360
     * @param degrees input angle in degrees
     * @return normalized angle
     */
    public static float normalizeAngle(float degrees)
    {
        degrees %= 360;
        degrees = (degrees + 360f) % 360;
        return degrees;
    }
}
