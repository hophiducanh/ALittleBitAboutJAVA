package com.tellyouiam.finalkeyword.blankfinal.oneconstructor;

// A sample Java program to demonstrate use and
// working of blank final
class Test
{
    // We can initialize here, but if we
    // initialize here, then all objects get
    // the same value.  So we use blank final

    //Nếu i không dùng trong constructor, thì khi khởi tạo biến final initialize giá trị cho nó, vì giá trị của biến
    //final chỉ được set đúng một lần
    final int i;

    Test(int x)
    {
        // Since we have initialized above, we
        // must initialize i in constructor.
        // If we remove this line, we get compiler
        // error.
        this.i = x;
    }
}
