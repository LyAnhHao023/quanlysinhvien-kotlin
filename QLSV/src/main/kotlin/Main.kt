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
   
}