package kr.ac.gwnu.prototype

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import kotlinx.coroutines.selects.select

@Dao
interface RoomDao {
    @Insert(onConflict = REPLACE)
    fun insert(db:ListDataBase)

    @Query("select * from 'Database'")
    fun getAll():List<ListDataBase>
//get all -> 데이터 베이스의 모든 데이터를 가져오고 반환

    @Query("select 'inputdate' from `Database` where 'inputdate' ")
    fun getinputdate() : List<Long>
// Database 테이블에서 inputdate 가져오기
    @Query("select 'expirationdate' from  `Database`  where 'expirationdate'")
    fun getexpirationdate() : List<Long>
// Database 테이블에서 expirationdate 가져오기

    @Query("select 'ListName' from  `Database`  where 'ListName'")
    fun getListName() : List<String>
// Database 테이블에서 ListName 가져오기
    @Query("select 'coldroom' from  `Database`  where 'coldroom'")
    fun getcoldroom() : List<Boolean>
// Database 테이블에서 coldroom 가져오기 freezer

    @Query("select 'freezer' from  `Database`  where 'freezer'")
    fun getfreezer() : List<Boolean>
// Database 테이블에서 coldroom 가져오기 freezer



    //데이터 가져오기(select), *(모든 열을 가져옴), from(어디에서)

    @Query("select * from 'Database' order by 'no' desc")
    fun getAlldesc():List<ListDataBase>;
    //order by  bo(번호순) 정렬 desc(내림차순), asc(오름차순) no는 목록 데이터베이스 컬럼



    @Query("delete from  'Database' where `no` = :number ")
    fun DeleteData(number:Int) //int형 이라 받아옴 number = no 를 지정해서 삭제

    /* update문 */

    @Query("update 'Database' set 'inputdate' = :inputdate where `no` = :number ")
    fun Updateinputdate(inputdate: Long, number:Int)

    // no = number no를 참고하여 데이터의  inputdate(냉장고에 넣은날짜)를 수정


    @Query("update 'Database' set 'expirationdate' = :expirationdate where `no` = :number ")
    fun Updateexpirationdate(expirationdate: Long, number:Int)

    // no = number no를 참고하여 데이터의  expirationdate(유통기한날짜)를 수정

    @Query("update 'Database' set 'ListName' = :ListName where `no` = :number ")
    fun UpdateListName(ListName: String, number:Int)

    // no = number no를 참고하여 데이터의  ListName(물품이름)를 수정

    @Query("update 'Database' set 'coldroom' = :coldroom where `no` = :number ")
    fun Updatecoldroom(coldroom: Boolean, number:Int)

    @Query("update 'Database' set 'freezer' = :freezer where `no` = :number ")
    fun Updatefreezer(freezer: Boolean, number:Int)


}