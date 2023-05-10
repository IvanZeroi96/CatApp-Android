package com.ivan.garcia.catapp_android.model.breeds
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class BreedsModel (
    val weight: Weight,
    val id: String,
    val name: String,

    @Expose @SerializedName("cfa_url")
    val cfaURL: String? = null,

    @Expose @SerializedName("vetstreet_url")
    val vetstreetURL: String? = null,

    @Expose @SerializedName("vcahospitals_url")
    val vcahospitalsURL: String? = null,

    val temperament: String,
    val origin: String,

    @Expose @SerializedName("country_codes")
    val countryCodes: String,

    @Expose @SerializedName("country_code")
    val countryCode: String,

    val description: String,

    @Expose @SerializedName("life_span")
    val lifeSpan: String,

    val indoor: Long,
    val lap: Long? = null,

    @Expose @SerializedName("alt_names")
    val altNames: String? = null,

    val adaptability: Long,

    @Expose @SerializedName("affection_level")
    val affectionLevel: Long,

    @Expose @SerializedName("child_friendly")
    val childFriendly: Long,

    @Expose @SerializedName("dog_friendly")
    val dogFriendly: Long,

    @Expose @SerializedName("energy_level")
    val energyLevel: Long,

    val grooming: Long,

    @Expose @SerializedName("health_issues")
    val healthIssues: Long,

    val intelligence: Long,

    @Expose @SerializedName("shedding_level")
    val sheddingLevel: Long,

    @Expose @SerializedName("social_needs")
    val socialNeeds: Long,

    @Expose @SerializedName("stranger_friendly")
    val strangerFriendly: Long,

    val vocalisation: Long,
    val experimental: Long,
    val hairless: Long,
    val natural: Long,
    val rare: Long,
    val rex: Long,

    @Expose @SerializedName("suppressed_tail")
    val suppressedTail: Long,

    @Expose @SerializedName("short_legs")
    val shortLegs: Long,

    @Expose @SerializedName("wikipedia_url")
    val wikipediaURL: String? = null,

    val hypoallergenic: Long,

    @Expose @SerializedName("reference_image_id")
    val referenceImageID: String? = null,

    @Expose @SerializedName("cat_friendly")
    val catFriendly: Long? = null,

    val bidability: Long? = null
)

data class Weight (
    val imperial: String,
    val metric: String
)