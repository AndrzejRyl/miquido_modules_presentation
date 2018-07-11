package com.fleenmobile.core.utils.resources

import android.content.Context

class ResourceProviderImpl(private val context: Context) : ResourceProvider {

  override fun getString(id: Int): String = context.getString(id)

  override fun getString(id: Int, param: String) = context.getString(id, param)
}