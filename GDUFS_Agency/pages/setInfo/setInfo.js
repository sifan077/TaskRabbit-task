const defaultAvatarUrl = 'https://mmbiz.qpic.cn/mmbiz/icTdbqWNOwNRna42FI242Lcia07jQodd2FJGIYQfG0LAJGFxM4FbnQP6yfMxBgJ0F3YRqJCJ1aPAK2dQagdusBZg/0'
var app = getApp();
Page({
  data: {
    avatarUrl: defaultAvatarUrl,
  },
  onChooseAvatar(e) {
    const { avatarUrl } = e.detail 
    this.setData({
      avatarUrl,
    })
    wx.request({
      url: app.data.apiUrl+'/user/setInfo',
      data: {
        openId: wx.getStorageSync('userInfo').openId,
        avatarUrl:avatarUrl
      },
      header: {
        'content-type': 'application/json'
      },
    })
  }
})