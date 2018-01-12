package com.yeguohao.bbmusic.discover.music.entites;

public class PersonalizedPlaylistResult {

        /**
         * id : 759638016
         * type : 0
         * name : 我是邮差，你是一封信
         * copywriter : 编辑推荐：从前车马很慢，书信很远，一生只够爱一个人
         * picUrl : http://p1.music.126.net/qa2LYd1CyRbuQ9lh65yqog==/18813743464941115.jpg
         * canDislike : false
         * playCount : 1395699.2
         * trackCount : 68
         * highQuality : false
         * alg : featured
         */

        private int id;
        private int type;
        private String name;
        private String copywriter;
        private String picUrl;
        private boolean canDislike;
        private double playCount;
        private int trackCount;
        private boolean highQuality;
        private String alg;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCopywriter() {
            return copywriter;
        }

        public void setCopywriter(String copywriter) {
            this.copywriter = copywriter;
        }

        public String getPicUrl() {
            return picUrl;
        }

        public void setPicUrl(String picUrl) {
            this.picUrl = picUrl;
        }

        public boolean isCanDislike() {
            return canDislike;
        }

        public void setCanDislike(boolean canDislike) {
            this.canDislike = canDislike;
        }

        public double getPlayCount() {
            return playCount;
        }

        public void setPlayCount(double playCount) {
            this.playCount = playCount;
        }

        public int getTrackCount() {
            return trackCount;
        }

        public void setTrackCount(int trackCount) {
            this.trackCount = trackCount;
        }

        public boolean isHighQuality() {
            return highQuality;
        }

        public void setHighQuality(boolean highQuality) {
            this.highQuality = highQuality;
        }

        public String getAlg() {
            return alg;
        }

        public void setAlg(String alg) {
            this.alg = alg;
        }
}
