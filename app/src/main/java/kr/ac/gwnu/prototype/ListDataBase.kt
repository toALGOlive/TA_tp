package kr.ac.gwnu.prototype

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Database")
class ListDataBase {
    @PrimaryKey(autoGenerate = true) //주키 값 등록시 1씩증가
    @ColumnInfo //컬럼 생성
    var no: Int = 0
    //숫자 db , 고유값? , 자동 카운트, = 목록번호

    @ColumnInfo
    var inputdate: Long? = 0 // 넣은 날짜

    @ColumnInfo
    var expirationdate: Long? = 0 // 유통기한

    @ColumnInfo
    var ListName: String? = ""; // 물건이름름

    @ColumnInfo
    var coldroom: Boolean = false //냉장고

    @ColumnInfo
    var freezer: Boolean = true  //냉동고


    //데이터 베이스는 화면에 귀속 x

    constructor(
        inputdate: Long?,
        expirationdate: Long?,
        ListName: String?,
        coldroom: Boolean, //부울 값은 null 허용하면안됨
        freezer: Boolean
    ) {
        this.inputdate = inputdate
        this.expirationdate = expirationdate
        this.ListName = ListName
        this.coldroom = coldroom
        this.freezer = freezer
    }
}