package com.example.cheng.welove.service.entity;

import java.util.List;

/**
 * Created by cheng on 2017/2/16.
 */

public class Book {


    /**
     * count : 1
     * start : 0
     * total : 503
     * books : [{"rating":{"max":10,"numRaters":813,"average":"8.8","min":0},"subtitle":"张竹坡批评第一奇书","pubdate":"1987年1月","image":"https://img3.doubanio.com/mpic/s3912954.jpg","binding":"平装","images":{"small":"https://img3.doubanio.com/spic/s3912954.jpg","large":"https://img3.doubanio.com/lpic/s3912954.jpg","medium":"https://img3.doubanio.com/mpic/s3912954.jpg"},"alt":"https://book.douban.com/subject/3079969/","id":"3079969","title":"金瓶梅","author_intro":"王汝梅 李昭恂 于凤树 校点。","tags":[{"count":380,"name":"金瓶梅","title":"金瓶梅"},{"count":248,"name":"古典文学","title":"古典文学"},{"count":173,"name":"兰陵笑笑生","title":"兰陵笑笑生"},{"count":168,"name":"小说","title":"小说"},{"count":124,"name":"中国古典文学","title":"中国古典文学"},{"count":92,"name":"中国文学","title":"中国文学"},{"count":82,"name":"经典","title":"经典"},{"count":65,"name":"古典","title":"古典"}],"origin_title":"","price":"68","translator":[],"catalog":"","pages":"1588","publisher":"齐鲁书社","isbn10":"SH10206-160","alt_title":"张竹坡批评第一奇书","url":"https://api.douban.com/v2/book/3079969","author":["兰陵笑笑生"],"summary":""}]
     */

    private int count;
    private int start;
    private int total;
    private List<BooksBean> books;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<BooksBean> getBooks() {
        return books;
    }

    public void setBooks(List<BooksBean> books) {
        this.books = books;
    }

    public static class BooksBean {
        /**
         * rating : {"max":10,"numRaters":813,"average":"8.8","min":0}
         * subtitle : 张竹坡批评第一奇书
         * pubdate : 1987年1月
         * image : https://img3.doubanio.com/mpic/s3912954.jpg
         * binding : 平装
         * images : {"small":"https://img3.doubanio.com/spic/s3912954.jpg","large":"https://img3.doubanio.com/lpic/s3912954.jpg","medium":"https://img3.doubanio.com/mpic/s3912954.jpg"}
         * alt : https://book.douban.com/subject/3079969/
         * id : 3079969
         * title : 金瓶梅
         * author_intro : 王汝梅 李昭恂 于凤树 校点。
         * tags : [{"count":380,"name":"金瓶梅","title":"金瓶梅"},{"count":248,"name":"古典文学","title":"古典文学"},{"count":173,"name":"兰陵笑笑生","title":"兰陵笑笑生"},{"count":168,"name":"小说","title":"小说"},{"count":124,"name":"中国古典文学","title":"中国古典文学"},{"count":92,"name":"中国文学","title":"中国文学"},{"count":82,"name":"经典","title":"经典"},{"count":65,"name":"古典","title":"古典"}]
         * origin_title :
         * price : 68
         * translator : []
         * catalog :
         * pages : 1588
         * publisher : 齐鲁书社
         * isbn10 : SH10206-160
         * alt_title : 张竹坡批评第一奇书
         * url : https://api.douban.com/v2/book/3079969
         * author : ["兰陵笑笑生"]
         * summary :
         */

        private RatingBean rating;
        private String subtitle;
        private String pubdate;
        private String image;
        private String binding;
        private ImagesBean images;
        private String alt;
        private String id;
        private String title;
        private String author_intro;
        private String origin_title;
        private String price;
        private String catalog;
        private String pages;
        private String publisher;
        private String isbn10;
        private String alt_title;
        private String url;
        private String summary;
        private List<TagsBean> tags;
        private List<?> translator;
        private List<String> author;

        public RatingBean getRating() {
            return rating;
        }

        public void setRating(RatingBean rating) {
            this.rating = rating;
        }

        public String getSubtitle() {
            return subtitle;
        }

        public void setSubtitle(String subtitle) {
            this.subtitle = subtitle;
        }

        public String getPubdate() {
            return pubdate;
        }

        public void setPubdate(String pubdate) {
            this.pubdate = pubdate;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getBinding() {
            return binding;
        }

        public void setBinding(String binding) {
            this.binding = binding;
        }

        public ImagesBean getImages() {
            return images;
        }

        public void setImages(ImagesBean images) {
            this.images = images;
        }

        public String getAlt() {
            return alt;
        }

        public void setAlt(String alt) {
            this.alt = alt;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAuthor_intro() {
            return author_intro;
        }

        public void setAuthor_intro(String author_intro) {
            this.author_intro = author_intro;
        }

        public String getOrigin_title() {
            return origin_title;
        }

        public void setOrigin_title(String origin_title) {
            this.origin_title = origin_title;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public String getCatalog() {
            return catalog;
        }

        public void setCatalog(String catalog) {
            this.catalog = catalog;
        }

        public String getPages() {
            return pages;
        }

        public void setPages(String pages) {
            this.pages = pages;
        }

        public String getPublisher() {
            return publisher;
        }

        public void setPublisher(String publisher) {
            this.publisher = publisher;
        }

        public String getIsbn10() {
            return isbn10;
        }

        public void setIsbn10(String isbn10) {
            this.isbn10 = isbn10;
        }

        public String getAlt_title() {
            return alt_title;
        }

        public void setAlt_title(String alt_title) {
            this.alt_title = alt_title;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getSummary() {
            return summary;
        }

        public void setSummary(String summary) {
            this.summary = summary;
        }

        public List<TagsBean> getTags() {
            return tags;
        }

        public void setTags(List<TagsBean> tags) {
            this.tags = tags;
        }

        public List<?> getTranslator() {
            return translator;
        }

        public void setTranslator(List<?> translator) {
            this.translator = translator;
        }

        public List<String> getAuthor() {
            return author;
        }

        public void setAuthor(List<String> author) {
            this.author = author;
        }

        public static class RatingBean {
            /**
             * max : 10
             * numRaters : 813
             * average : 8.8
             * min : 0
             */

            private int max;
            private int numRaters;
            private String average;
            private int min;

            public int getMax() {
                return max;
            }

            public void setMax(int max) {
                this.max = max;
            }

            public int getNumRaters() {
                return numRaters;
            }

            public void setNumRaters(int numRaters) {
                this.numRaters = numRaters;
            }

            public String getAverage() {
                return average;
            }

            public void setAverage(String average) {
                this.average = average;
            }

            public int getMin() {
                return min;
            }

            public void setMin(int min) {
                this.min = min;
            }
        }

        public static class ImagesBean {
            /**
             * small : https://img3.doubanio.com/spic/s3912954.jpg
             * large : https://img3.doubanio.com/lpic/s3912954.jpg
             * medium : https://img3.doubanio.com/mpic/s3912954.jpg
             */

            private String small;
            private String large;
            private String medium;

            public String getSmall() {
                return small;
            }

            public void setSmall(String small) {
                this.small = small;
            }

            public String getLarge() {
                return large;
            }

            public void setLarge(String large) {
                this.large = large;
            }

            public String getMedium() {
                return medium;
            }

            public void setMedium(String medium) {
                this.medium = medium;
            }
        }

        public static class TagsBean {
            /**
             * count : 380
             * name : 金瓶梅
             * title : 金瓶梅
             */

            private int count;
            private String name;
            private String title;

            public int getCount() {
                return count;
            }

            public void setCount(int count) {
                this.count = count;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }
        }
    }


}
