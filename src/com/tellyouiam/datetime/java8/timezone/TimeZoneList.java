package com.tellyouiam.datetime.java8.timezone;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TimeZoneList {
    //https://www.baeldung.com/java-time-zones
    public enum OffsetBase {
        GMT, UTC
    }

    private static String getOffset(LocalDateTime dateTime, ZoneId id) {
        return dateTime
                .atZone(id)
                .getOffset()
                .getId()
                .replace("Z", "+00:00");
    }

    private static class ZoneComparator implements Comparator<ZoneId> {

        @Override
        public int compare(ZoneId zoneId1, ZoneId zoneId2) {
            LocalDateTime now = LocalDateTime.now();

            ZoneOffset offset1 = now
                    .atZone(zoneId1)
                    .getOffset();

            ZoneOffset offset2 = now
                    .atZone(zoneId2)
                    .getOffset();

            return offset1.compareTo(offset2);
        }
    }

    public static List<String> getTimeZoneList(OffsetBase base) {
        LocalDateTime now = LocalDateTime.now();
        return ZoneId.getAvailableZoneIds().stream()
                .map(ZoneId::of)
                .sorted(new ZoneComparator())
                .map(id -> String.format(
                        "(%s%s) %s",
                        base, getOffset(now, id), id.getId()))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        //getTimeZoneList(OffsetBase.UTC).forEach(System.out::println);

        System.out.println(ZoneId.systemDefault().getId());
        System.out.println(LocalDateTime.now().atZone(ZoneId.systemDefault()).getOffset().getId());
    }
}