package kr.ac.gwnu.prototype

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import java.security.AccessControlContext


@Database(entities = arrayOf(ListDataBase::class), version =1, exportSchema = false)

abstract class RoomHelper: RoomDatabase() {
    abstract  fun databaseDao() :RoomDao

    companion object {
        private var instance: RoomHelper? = null

        fun getInstance(context: Context):RoomHelper {
            val dbInstance = Room.databaseBuilder(context.applicationContext,RoomHelper::class.java,"Database").build()
            instance = dbInstance
            return  dbInstance
            /*  메인 엑티비티 또는 프레그먼트에서  쓰는법
             helper = RoomHelper.getInstance(requireContext())

            fun getData() {
                    Thread{
                        val list = helper?.databaseDao()?.getAll() ->전부 가져오는거
                        val hList = helper?.databaseDao()?.getexpirationdate ->예시) Dao에 등록된 유통기한 가져오는 함수
                      /*각 요소에 맞는 함수를 더해주면된다.*/
                /* oncreate 끝나고 붙여주기 */
                override fun onResume() {
                super.onResume()
                 getData()
             */
        }
    }
}