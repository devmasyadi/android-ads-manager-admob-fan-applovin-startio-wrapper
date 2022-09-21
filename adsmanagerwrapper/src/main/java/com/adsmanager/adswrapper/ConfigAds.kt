package com.adsmanager.adswrapper

import com.adsmanager.ads.NetworkAds
import com.adsmanager.ads.NetworkOpenAd

object ConfigAds {
    var isShowAds = false
    var intervalTimeInterstitial = 10 // seconds

    var primaryNetworkOpenAd = NetworkOpenAd.ADMOB
    var secondaryNetworkOpenAd: NetworkOpenAd? = null
    var tertiaryAdsNetworkOpenAd: NetworkOpenAd? = null

    var primaryOpenAdId = "123"
    var secondaryOpenAdId: String? = null
    var tertiaryOpenAdId: String? = null

    var primaryAds: NetworkAds = NetworkAds.ADMOB
    var secondaryAds: NetworkAds? = null
    var tertiaryAds: NetworkAds? = null
    var quaternaryAds: NetworkAds? = null

    var primaryAppId = ""
    var secondaryAppId = ""
    var tertiaryAppId = "208690301"
    var quaternaryAppId = "208690301"

    var primaryBannerId = ""
    var secondaryBannerId = ""
    var tertiaryBannerId = ""
    var quaternaryBannerId = ""

    var primaryInterstitialId = ""
    var secondaryInterstitialId = ""
    var tertiaryInterstitialId = ""
    var quaternaryInterstitialId = ""

    var primaryNativeId = ""
    var secondaryNativeId = ""
    var tertiaryNativeId = ""
    var quaternaryNativeId = ""

    var primaryRewardsId = ""
    var secondaryRewardsId = ""
    var tertiaryRewardsId = ""
    var quaternaryRewardsId = ""
}