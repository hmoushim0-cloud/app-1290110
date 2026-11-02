package sa.factory.app1290110.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import sa.factory.app1290110.data.EducationalResourcePackageRepository
import sa.factory.app1290110.model.EducationalResourcePackage
import sa.factory.app1290110.model.DigitalDocumentTemplate
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

class EducationalResourcePackageViewModel(
    private val repository: EducationalResourcePackageRepository
) : ViewModel() {
    val catalog: StateFlow<List<DigitalDocumentTemplate>> = repository.getAvailableCatalog()
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), emptyList())

    val activeRequest: StateFlow<EducationalResourcePackage?> = repository.getActiveRequest()
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), null)

    fun submitNewOrder(request: EducationalResourcePackage) {
        viewModelScope.launch {
            repository.submitRequest(request)
        }
    }
}
