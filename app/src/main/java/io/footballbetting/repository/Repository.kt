package io.footballbetting.repository

import io.footballbetting.model.DataModel
import io.footballbetting.api.RetrofitInstance
import retrofit2.Response

class Repository {

    suspend fun dataForm(dataModel: DataModel): Response<DataModel>{
        return RetrofitInstance.api.dataForm(dataModel)
    }
}
