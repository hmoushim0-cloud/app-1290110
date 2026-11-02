package sa.factory.app1290110.model

import kotlinx.serialization.Serializable

@Serializable
data class DigitalDocumentTemplate(
    val id: String,
    val title: String,
    val description: String,
    val priceMinorUnits: Long,
    val iconVector: String = "verified"
)

@Serializable
data class EducationalResourcePackage(
    val requestId: String,
    val items: List<DigitalDocumentTemplate>,
    val customerPhone: String,
    val totalAmountMinorUnits: Long,
    val status: EducationalResourcePackageStatus = EducationalResourcePackageStatus.PENDING,
    val createdAtEpochMs: Long = System.currentTimeMillis()
)

enum class EducationalResourcePackageStatus {
    PENDING,
    ACCEPTED,
    IN_PROGRESS,
    COMPLETED,
    CANCELLED
}
