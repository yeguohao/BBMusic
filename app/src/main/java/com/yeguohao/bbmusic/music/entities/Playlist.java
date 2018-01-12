package com.yeguohao.bbmusic.music.entities;

import java.util.List;

public class Playlist {
        /**
         * subscribers : []
         * subscribed : false
         * creator : {"defaultAvatar":true,"province":440000,"authStatus":0,"followed":false,"avatarUrl":"http://p1.music.126.net/VnZiScyynLG7atLIZ2YPkw==/18686200114669622.jpg","accountStatus":0,"gender":0,"city":441900,"birthday":-2209017600000,"userId":98052967,"userType":0,"nickname":"万日草","signature":"","description":"","detailDescription":"","avatarImgId":18686200114669622,"backgroundImgId":2002210674180200,"backgroundUrl":"http://p1.music.126.net/45Nu4EqvFqK_kQj6BkPwcw==/2002210674180200.jpg","authority":0,"mutual":false,"expertTags":null,"experts":null,"djStatus":0,"vipType":0,"remarkName":null,"backgroundImgIdStr":"2002210674180200","avatarImgIdStr":"18686200114669622","avatarImgId_str":"18686200114669622"}
         * artists : null
         * tracks : null
         * ordered : false
         * tags : []
         * subscribedCount : 0
         * cloudTrackCount : 0
         * adType : 0
         * trackNumberUpdateTime : 1479731450326
         * description : null
         * status : 0
         * userId : 98052967
         * coverImgId : 3297435373196185
         * createTime : 1444869856353
         * updateTime : 1479731450326
         * trackUpdateTime : 1515762077491
         * trackCount : 119
         * commentThreadId : A_PL_0_116172516
         * totalDuration : 0
         * highQuality : false
         * privacy : 0
         * newImported : false
         * anonimous : false
         * playCount : 33
         * specialType : 5
         * coverImgUrl : http://p1.music.126.net/WY1287A46OOFCGk_a7Kafw==/3297435373196185.jpg
         * name : 万日草喜欢的音乐
         * id : 116172516
         */

        private boolean subscribed;
        private Creator creator;
        private Object artists;
        private Object tracks;
        private boolean ordered;
        private int subscribedCount;
        private int cloudTrackCount;
        private int adType;
        private long trackNumberUpdateTime;
        private Object description;
        private int status;
        private int userId;
        private long coverImgId;
        private long createTime;
        private long updateTime;
        private long trackUpdateTime;
        private int trackCount;
        private String commentThreadId;
        private int totalDuration;
        private boolean highQuality;
        private int privacy;
        private boolean newImported;
        private boolean anonimous;
        private int playCount;
        private int specialType;
        private String coverImgUrl;
        private String name;
        private int id;
        private List<?> subscribers;
        private List<?> tags;

        public boolean isSubscribed() {
            return subscribed;
        }

        public void setSubscribed(boolean subscribed) {
            this.subscribed = subscribed;
        }

        public Creator getCreator() {
            return creator;
        }

        public void setCreator(Creator creator) {
            this.creator = creator;
        }

        public Object getArtists() {
            return artists;
        }

        public void setArtists(Object artists) {
            this.artists = artists;
        }

        public Object getTracks() {
            return tracks;
        }

        public void setTracks(Object tracks) {
            this.tracks = tracks;
        }

        public boolean isOrdered() {
            return ordered;
        }

        public void setOrdered(boolean ordered) {
            this.ordered = ordered;
        }

        public int getSubscribedCount() {
            return subscribedCount;
        }

        public void setSubscribedCount(int subscribedCount) {
            this.subscribedCount = subscribedCount;
        }

        public int getCloudTrackCount() {
            return cloudTrackCount;
        }

        public void setCloudTrackCount(int cloudTrackCount) {
            this.cloudTrackCount = cloudTrackCount;
        }

        public int getAdType() {
            return adType;
        }

        public void setAdType(int adType) {
            this.adType = adType;
        }

        public long getTrackNumberUpdateTime() {
            return trackNumberUpdateTime;
        }

        public void setTrackNumberUpdateTime(long trackNumberUpdateTime) {
            this.trackNumberUpdateTime = trackNumberUpdateTime;
        }

        public Object getDescription() {
            return description;
        }

        public void setDescription(Object description) {
            this.description = description;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public long getCoverImgId() {
            return coverImgId;
        }

        public void setCoverImgId(long coverImgId) {
            this.coverImgId = coverImgId;
        }

        public long getCreateTime() {
            return createTime;
        }

        public void setCreateTime(long createTime) {
            this.createTime = createTime;
        }

        public long getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(long updateTime) {
            this.updateTime = updateTime;
        }

        public long getTrackUpdateTime() {
            return trackUpdateTime;
        }

        public void setTrackUpdateTime(long trackUpdateTime) {
            this.trackUpdateTime = trackUpdateTime;
        }

        public int getTrackCount() {
            return trackCount;
        }

        public void setTrackCount(int trackCount) {
            this.trackCount = trackCount;
        }

        public String getCommentThreadId() {
            return commentThreadId;
        }

        public void setCommentThreadId(String commentThreadId) {
            this.commentThreadId = commentThreadId;
        }

        public int getTotalDuration() {
            return totalDuration;
        }

        public void setTotalDuration(int totalDuration) {
            this.totalDuration = totalDuration;
        }

        public boolean isHighQuality() {
            return highQuality;
        }

        public void setHighQuality(boolean highQuality) {
            this.highQuality = highQuality;
        }

        public int getPrivacy() {
            return privacy;
        }

        public void setPrivacy(int privacy) {
            this.privacy = privacy;
        }

        public boolean isNewImported() {
            return newImported;
        }

        public void setNewImported(boolean newImported) {
            this.newImported = newImported;
        }

        public boolean isAnonimous() {
            return anonimous;
        }

        public void setAnonimous(boolean anonimous) {
            this.anonimous = anonimous;
        }

        public int getPlayCount() {
            return playCount;
        }

        public void setPlayCount(int playCount) {
            this.playCount = playCount;
        }

        public int getSpecialType() {
            return specialType;
        }

        public void setSpecialType(int specialType) {
            this.specialType = specialType;
        }

        public String getCoverImgUrl() {
            return coverImgUrl;
        }

        public void setCoverImgUrl(String coverImgUrl) {
            this.coverImgUrl = coverImgUrl;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public List<?> getSubscribers() {
            return subscribers;
        }

        public void setSubscribers(List<?> subscribers) {
            this.subscribers = subscribers;
        }

        public List<?> getTags() {
            return tags;
        }

        public void setTags(List<?> tags) {
            this.tags = tags;
        }

    }
