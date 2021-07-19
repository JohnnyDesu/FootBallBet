package io.footballbetting.api


import io.footballbetting.model.DataModel
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST


interface API {
    @POST("ajax_data.php")
    suspend fun dataForm(
        @Body dataModal: DataModel
    ): Response<DataModel>

}

