//app.js

App({

  data: {
    sessionid: null,
    // apiUrl:'http://7sjjhx.natappfree.cc/',
    apiUrl:'http://localhost:8080/',
    userInfo: null,
    currentUrl:''
  },

  onLaunch: function(e) {
    var that = this
    //"getOenid"
    console.log(that.getSessionid())
  },
  getSessionid: function() {
    var that = this
    wx.getStorageSync({
      key: 'sessionId',
      success: function(res) {
        that.data.sessionid = res.data.sessionid;
        console.log("sessionid= " + that.data.sessionid)
      },
    });
  },
})