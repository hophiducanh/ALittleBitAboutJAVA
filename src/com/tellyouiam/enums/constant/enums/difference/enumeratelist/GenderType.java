package com.tellyouiam.enums.constant.enums.difference.enumeratelist;

public enum GenderType {
    MALE, FEMALE;


    PlayerType playerType = PlayerType.ARCHER;

    //Rõ ràng khi dùng Enum không thể gán MALE (GenderType cho PlayerType đó là lợi thế của Enum)
    //PlayerType playerType = PlayerType.MALE;

}

