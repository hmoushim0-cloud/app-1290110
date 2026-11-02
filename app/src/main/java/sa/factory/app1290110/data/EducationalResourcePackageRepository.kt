package sa.factory.app1290110.data

import sa.factory.app1290110.model.EducationalResourcePackage
import sa.factory.app1290110.model.DigitalDocumentTemplate
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

interface EducationalResourcePackageRepository {
    fun getAvailableCatalog(): Flow<List<DigitalDocumentTemplate>>
    fun getActiveRequest(): Flow<EducationalResourcePackage?>
    suspend fun submitRequest(request: EducationalResourcePackage): Result<String>
}

class InMemoryEducationalResourcePackageRepository : EducationalResourcePackageRepository {
    private val _catalog = MutableStateFlow<List<DigitalDocumentTemplate>>(listOf(
        DigitalDocumentTemplate("1", "حقيبة الإدارة المدرسية الشاملة", "ملفات ونماذج تنظيمية متكاملة لمدراء المدارس ووكلاء الشؤون التعليمية تشمل نماذج الحضور والانضباط", 5000L, "verified"),
        DigitalDocumentTemplate("2", "سجل إنجاز المعلم التفاعلي المطور", "قوالب تصميم احترافية جاهزة للطباعة والتعديل تشمل خطط التوزيع الفصلي وتحضير الدروس والتقييمات", 9500L, "bolt")
    ))
    private val _active = MutableStateFlow<EducationalResourcePackage?>(null)

    override fun getAvailableCatalog(): Flow<List<DigitalDocumentTemplate>> = _catalog.asStateFlow()
    override fun getActiveRequest(): Flow<EducationalResourcePackage?> = _active.asStateFlow()

    override suspend fun submitRequest(request: EducationalResourcePackage): Result<String> {
        _active.value = request
        return Result.success(request.requestId)
    }
}
