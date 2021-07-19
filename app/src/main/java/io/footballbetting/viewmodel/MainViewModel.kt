package io.footballbetting.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import io.footballbetting.model.DataModel
import io.footballbetting.repository.Repository
import kotlinx.coroutines.launch
import retrofit2.Response

class MainViewModel(private val repository: Repository): ViewModel() {

    var myResponse: MutableLiveData<Response<DataModel>> = MutableLiveData()
    var myResponse2: MutableLiveData<Response<DataModel>> = MutableLiveData()
    var myCustomPosts: MutableLiveData<Response<List<DataModel>>> = MutableLiveData()
    var myCustomPosts2: MutableLiveData<Response<List<DataModel>>> = MutableLiveData()

    fun dataForm(DataModel: DataModel) {
        viewModelScope.launch {
            val response = repository.dataForm(DataModel)
            myResponse.value = response
        }
    }
}