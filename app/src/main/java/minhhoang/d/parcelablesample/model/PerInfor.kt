package minhhoang.d.parcelablesample.model

import android.os.Parcel
import android.os.Parcelable

data class PerInfor(var name: String? = null,
                    var sur_name: String? = null) : Parcelable {
    constructor(parcel: Parcel) : this(
            parcel.readString(),
            parcel.readString()) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeString(sur_name)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<PerInfor> {
        override fun createFromParcel(parcel: Parcel): PerInfor {
            return PerInfor(parcel)
        }

        override fun newArray(size: Int): Array<PerInfor?> {
            return arrayOfNulls(size)
        }
    }
}