


public class Configs {
    // Cấu hình số lượng hình h�?c
    public static final int SO_LUONG_HINH_TOI_THIEU = 0;
    public static final int SO_LUONG_HINH_TOI_DA = 5;
    
    // Các cấu hình khác
    public static final float PI = 3.14f;
    public static final float INCH_CM = 2.54f; // 1 inch = 2.54 cm
    public static final int DON_VI_CM = 1; // �?ánh dấu ứng dụng đang dùng đơn vị centimet
    public static final int DON_VI_INC = 2; // �?ánh dấu ứng dụng đang dùng đơn vị inch
    public static int donVi = DON_VI_CM; // C�? Cho biết đang dùng đơn vị gì
    
    // Phương thức static giúp chuyển đổi centimet sang inch
    public static float ChuyenCentimetSangInch(float cm) {
        float inch = cm / INCH_CM;
        return inch;
    }
    
    // Phương thức static giúp chuyển đổi inch sang centimet
    public static float ChuyenInchSangCentimet(float inch) {
        float cm = inch * INCH_CM; 
        return cm;
    }
}