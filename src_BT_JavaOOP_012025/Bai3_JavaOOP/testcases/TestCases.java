package Bai3_JavaOOP.testcases;

import Bai3_JavaOOP.common.BaseTest;

public class TestCases extends BaseTest {

    //Hàm trung gian để gọi lại dưới hàm testAddCategory
    public void loginCRM() {
        System.out.println("Mở trình duyệt web và nhập URL https://cms.anhtester.com/login");
        System.out.println("Nhập username và password hợp lệ");
        System.out.println("Nhấn vào nút \"login\" để thực hiện đăng nhập");
        System.out.println("Đã được chuyển hướng đến trang admin CMS");
    }

    public void testLogin() {
        createDriver();

        loginCRM();

        closeDriver();
    }

    public void testAddCategory() {
        createDriver();

        loginCRM();
        System.out.println("Nhấn menu Products");
        System.out.println("Nhấn menu Category để đến trang danh sách danh mục");
        System.out.println("Nhấn 'Add New Category'");
        System.out.println("Nhập đầy đủ thông tin yêu cầu cho danh mục");
        System.out.println("Nhấn nút 'Save'");
        System.out.println("Kiểm tra danh mục mới được thêm vào trang danh sách danh mục");

        closeDriver();
    }

    public static void main(String[] args) {
        TestCases testCases = new TestCases();
        testCases.testLogin();
        System.out.println("********************************");
        testCases.testAddCategory();
    }
}
