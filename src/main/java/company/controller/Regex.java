package company.controller;

public interface Regex {

    String nameRegex = "^[А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє']{1,20}$";
    String surnameRegex = "^[А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє']{1,20}$";
    String email = "/\\A[^@]+@([^@\\.]+\\.)+[^@\\.]+\\z/";


}
