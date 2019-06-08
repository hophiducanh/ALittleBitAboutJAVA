package com.tellyouiam.logging;

import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

//Reference: https://www.geeksforgeeks.org/logging-in-java/


/**
 * Log là một quá trình ghi lại những thông tin được thông báo,
 * lưu lại trong quá trình hoạt động của một ứng dụng ở một nơi tập trung.
 * Mục đích chính là để có thể xem lại các thông tin hoạt động của ứng dụng trong quá khứ như debug khi có lỗi xảy ra,
 * check health, xem info, error, warning,…
 *
 * Có nhiều cách để ghi log: có thể lưu vào file, console (sử dụng lệnh sysout), database hoặc đâu đó để có thể xem lại được.
 * Trong các ứng dụng thực tế, lưu ra console ít được lựa chọn bởi có một số hạn chế sau:
 *
 * Chỉ hiển thị kết quả ra console.
 * Vì vậy, mỗi khi console được đóng thì tất cả thông tin log được show trên console cũng mất.
 * Nội dụng log được hiển thị trên console rất khó đọc.
 * */

/**
 * Ví dụ: khi bạn xử lý một HTTP request từ phía client,
 * request này khi được xử lý thì gây ra lỗi 500 – “Internal server error”. Khi đó thông tin log ở đây ít nhất phải có:
 *
 * Thời gian request.
 * Người request.
 * HTTP request info: header, request, body,…
 * HTTP response info.
 * Error stack trace về error đó như lỗi ở đoạn nào, dòng nào, lỗi gì, input như thế nào,…
 * */

class DemoLogger {

    private final static Logger LOGGER =
            Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    // Get the Logger from the log manager which corresponds
    // to the given name <Logger.GLOBAL_LOGGER_NAME here>
    // static so that it is linked to the class and not to
    // a particular log instance because Log Manage is universal

    void makeSomeLog() {
        // add some code of your choice here
        // moving to the logging part now
        LOGGER.log(Level.INFO, "My first Log Message");

        // A log of INFO level with the message "My First Log Message"
    }
}

class GeeksforGeeks {
    public static void main(String[] args) {
        DemoLogger obj = new DemoLogger();
        obj.makeSomeLog();

        // Generating some log messages through the
        // function defined above
        LogManager lgmngr = LogManager.getLogManager();

        // lgmngr now contains a reference to the log manager.
        Logger log = lgmngr.getLogger(Logger.GLOBAL_LOGGER_NAME);

        // Getting the global application level logger
        // from the Java Log Manager
        log.log(Level.INFO, "This is a log message");

        // Create a log message to be displayed
        // The message has a level of Info
    }
}
