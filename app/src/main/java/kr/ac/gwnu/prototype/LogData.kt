package kr.ac.gwnu.prototype
//DAO애서 끌어올 객체 모델
data class LogData (
    var no:Int,
    var inputdate:Long?,
    var expirationdate: Long?,
    var ListName : String?, //공복
    var  postprandial : Int?, // 식후
    var  coldroom: Boolean?,
    var  freezer: Boolean?,


        )