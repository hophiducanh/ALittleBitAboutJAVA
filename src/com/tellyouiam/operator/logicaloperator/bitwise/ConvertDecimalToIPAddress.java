package com.tellyouiam.operator.logicaloperator.bitwise;

public class ConvertDecimalToIPAddress {
    /**
     * In short, & 0xFF is used to make sure you always GET the LAST 8 bits. Let’s see an example to convert an IP address to/from decimal number.
     * */

    /**
     * Decimal   = 3232235778
     * Binary    = 11000000 10101000 00000001 00000010
     * IpAddress = 192      168      1        2
     *
     * (ipAddress>>24)
     *             -------------------------->24
     * Binary    = 00000000 00000000 00000000 11000000
     *
     * (ipAddress>>24) & 0xFF
     * Binary    = 00000000 00000000 00000000 11000000
     * & 0xFF    = 00000000 00000000 00000000 11111111
     * Result    = 00000000 00000000 00000000 11000000 = 192 (2^7 + 2^6)
     * */

    /**
     * Decimal = 3232235778
     * Binary  = 11000000 10101000 00000001 00000010
     *
     * (ipAddress>>16)
     *           ----------------->16
     * Binary  = 00000000 00000000 11000000 10101000
     *
     * (ipAddress>>16) & 0xFF
     * Binary  = 00000000 00000000 11000000 10101000 = 49320 (2^14 + 2^15 + 2^7 + 2^5 + 2^3)
     * & 0xFF  = 00000000 00000000 00000000 11111111
     * Result  = 00000000 00000000 00000000 10101000 = 168
     * */
    public static void main(String[] args) {

        ConvertDecimalToIPAddress obj = new ConvertDecimalToIPAddress();
        long ipAddressInLong = obj.ipToLong("192.168.1.2");
        System.out.println(ipAddressInLong);

        String binary = Long.toBinaryString(ipAddressInLong);
        printPrettyBinary(binary);

        String ipAddressInString = obj.longToIp(ipAddressInLong);
        System.out.println(ipAddressInString);

    }

    public long ipToLong(String ipAddress) {

        String[] addrArray = ipAddress.split("\\.");

        long num = 0;
        for (int i = 0; i < addrArray.length; i++) {

            int power = 3 - i;

            // 1. (192 % 256) * 256 pow 3
            // 2. (168 % 256) * 256 pow 2
            // 3. (2 % 256) * 256 pow 1
            // 4. (1 % 256) * 256 pow 0
            // Divide 256 because base 256 can't contains value greater than 256
            num += ((Integer.parseInt(addrArray[i]) % 256 * Math.pow(256, power)));

        }

        return num;
    }

    public String longToIp(long i) {

        return ((i >> 24) & 0xFF) + "." + ((i >> 16) & 0xFF) + "." + ((i >> 8) & 0xFF) + "." + (i & 0xFF);

    }

    //print pretty binary code, padding left zero
    private static void printPrettyBinary(String binary) {

        String s1 = String.format("%32s", binary).replace(' ', '0');
        System.out.format("%8s %8s %8s %8s %n",
                s1.substring(0, 8), s1.substring(8, 16),
                s1.substring(16, 24), s1.substring(24, 32));
    }
}
