package com.tellyouiam.collections.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayListTo2DArray {

    private static final String IS_INSTANCEOF_DATE_PATTERN = "([0-9]{0,2}([/\\-.])[0-9]{0,2}([/\\-.])[0-9]{0,4})";

    public static List<String> customSplitSpecific(String s) {
        List<String> words = new ArrayList<>();
        boolean notInsideComma = true;
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ',' && notInsideComma) {
                words.add(s.substring(start, i));
                start = i + 1;
            } else if (s.charAt(i) == '"')
                notInsideComma = !notInsideComma;
        }
        words.add(s.substring(start));
        return words;
    }

    private static boolean isRecognizedAsValidDate(String dateStr) {
        Matcher dateMatcher = Pattern.compile(IS_INSTANCEOF_DATE_PATTERN).matcher(dateStr);
        return dateMatcher.matches();
    }

    public static void main(String[] args) {
        String text = ",Share %,,,,,,,,,Display Name,,,,,,,,,,,,,Address,,,,,,,,,,,,,,,,,,,,,,,Phone,,,,,,,Fax,,,,,,,Mobile,,,,,,,,Email,,,,,,,,,,,,,\n" +
                "Ambidazzle,10.00%,,,,,1/07/2017,,,,\"Barnett, Peter\",,,,,,,,,,,,,          ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,02 9638 1955,,,,,,,,aranett@optusnet.com.au,,,,,,,,,,,,,N\n" +
                ",5.00%,,,,,1/07/2017,,,,\"Beer and Bubbles CT: Rebecca Bubbles\",,,,,,,,,,,,,8 Orange Grove       Walkley Heights SA 5098 ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,0475 946 651,,,,,,,,rebecca@atkinsconveyancing.com.au,,,,,,,,,,,,,N\n" +
                ",10.00%,,,,,1/11/2017,,,,\"Clark, Sharon\",,,,,,,,,,,,,PO Box 1022       SANCTUARY COVE QLD 4212 ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,0402 447 429,,,,,,,,sharon@hotelinteriors.com.au,,,,,,,,,,,,,N";

        String[] data = text.split("\n");
        Object[][] twoDArray = Arrays.stream(data).
                map(i -> Arrays.stream(i.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1)).toArray())
                .toArray(Object[][]::new);
        System.out.println(Arrays.deepToString(twoDArray));

//        List<String> listData = new ArrayList<>();
//        Collections.addAll(listData, data);

        List<String> listData = new ArrayList<>(Arrays.asList(text.split("\n")));
//        List<List<String>> nestList = listData.stream()
//                .map(i -> Arrays.asList(i.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1)))
//                .collect(Collectors.toList());

        List<List<String>> nestList = listData.stream()
                .map(ArrayListTo2DArray::customSplitSpecific)
                .collect(Collectors.toList());

        String[][] array = nestList.stream()
                .map(l -> l.toArray(new String[0]))
                .toArray(String[][]::new);
        System.out.println(Arrays.deepToString(array));

        AtomicInteger dateIndex = new AtomicInteger(-1);
        AtomicInteger gstIndex = new AtomicInteger(-1);
        IntStream.range(0, array.length)
                .forEach(i -> IntStream.range(0, array[i].length)
                        .forEach(j -> {

                            //append date header
                            if (isRecognizedAsValidDate(array[i][j])) {
                                dateIndex.set(j);
                                array[0][dateIndex.get()] = "Added Date";
                            }

                            if (array[i][j].equals("N") || array[i][j].equals("Y")) {
                                gstIndex.set(j);
                            }
                        })
                );

        System.out.println(dateIndex.get());
        System.out.println(gstIndex.get());
    }
}
