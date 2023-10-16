class ThiSinh(cccd: String, hoTen: String, toan: Float, ly: Float, hoa: Float, van: Float, anh: Float, khoiThi: String) {
    var cccd: String = ""
    var hoTen: String = ""
    var toan: Float = 0f
    var ly: Float = 0f
    var hoa: Float = 0f
    var van: Float = 0f
    var anh: Float = 0f
    var khoiThi: String = ""

    init {
        this.cccd = cccd
        this.hoTen = hoTen
        this.toan = toan
        this.ly = ly
        this.hoa = hoa
        this.van = van
        this.anh = anh
        this.khoiThi = khoiThi
    }
    fun tinhTongDiem(): Float {
        return when (khoiThi) {
            "A00" -> (toan + ly + hoa)
            "A01" -> (toan + ly + anh)
            "A02" -> (toan + van + anh)
            else -> 0f
        }
    }
    fun soSanhTen(thiSinh: ThiSinh): Int {
        return hoTen.compareTo(thiSinh.hoTen)
    }

    fun hienThiThongTin() {
        println("Thông tin thí sinh:")
        println("Số CCCD: $cccd")
        println("Họ tên: $hoTen")
        println("Điểm Toán: $toan")
        println("Điểm Lý: $ly")
        println("Điểm Hóa: $hoa")
        println("Điểm Văn: $van")
        println("Điểm Anh: $anh")
        println("Khối thi: $khoiThi")
    }

}

fun main() {
    // Nhập danh sách thí sinh
    val danhSachThiSinh = mutableListOf<ThiSinh>()

    var soLuongThiSinh: Int
    do {
        print("Nhập số lượng thí sinh: ")
        soLuongThiSinh = readLine()!!.toInt()
        if (soLuongThiSinh <= 0) {
            println("Số lượng thí sinh phải là số dương. Vui lòng nhập lại.")
        }
    } while (soLuongThiSinh <= 0)
    for (i in 1..soLuongThiSinh) {
        val thiSinh = ThiSinh()
        println("Nhập thông tin thí sinh $i:")
        print("Số CCCD: ")
        thiSinh.cccd = readLine()!!
        print("Họ tên: ")
        thiSinh.hoTen = readLine()!!
        print("Điểm Toán: ")
        thiSinh.toan = readLine()!!.toFloat()
        print("Điểm Lý: ")
        thiSinh.ly = readLine()!!.toFloat()
        print("Điểm Hóa: ")
        thiSinh.hoa = readLine()!!.toFloat()
        print("Điểm Văn: ")
        thiSinh.van = readLine()!!.toFloat()
        print("Điểm Anh: ")
        thiSinh.anh = readLine()!!.toFloat()
        print("Khối thi: ")
        thiSinh.khoiThi = readLine()!!
        danhSachThiSinh.add(thiSinh)
        println()
    }

    // Sắp xếp danh sách thí sinh theo họ tên từ điển
    danhSachThiSinh.sortBy { it.hoTen }

    // Nhập vào điểm chuẩn
    print("Nhập điểm chuẩn: ")
    val diemChuan = readLine()!!.toFloat()

    // Hiển thị thông tin thí sinh trúng tuyển
    println("\nThông tin thí sinh trúng tuyển:")
    for (thiSinh in danhSachThiSinh) {
        if (thiSinh.tinhTongDiem() >= diemChuan) {
            thiSinh.hienThiThongTin()
            println()
        }
    }
}