package com.codesquad.sidedish.config;

import com.codesquad.sidedish.utils.SampleDataFactory;
import com.codesquad.sidedish.web.sidedish.DTO.SidedishDTO;
import com.codesquad.sidedish.web.sidedish.DTO.BestSidedishDTO;
import com.codesquad.sidedish.web.sidedish.domain.Image;
import com.codesquad.sidedish.web.sidedish.domain.Sidedish;
import com.codesquad.sidedish.web.sidedish.domain.SidedishCategory;
import com.codesquad.sidedish.web.sidedish.repository.ImageRepository;
import com.codesquad.sidedish.web.sidedish.repository.SidedishCategoryRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Configuration
public class SampleDataConfig {
    ImageRepository imageRepository;

    public SampleDataConfig(ImageRepository imageRepository) {
        this.imageRepository = imageRepository;
    }

    @Bean
    public ApplicationRunner best(SidedishCategoryRepository sidedishCategoryRepository) {
        Image image = imageRepository.save(new Image("http://public.codesquad.kr/jk/storeapp/data/detail/HBDEF/4cce011a4a352c22cd399a60271b4921.jpg"
                , "재료부터 다른 수제미트볼조림"));
        Image thumbnailImage1 = imageRepository.save(new Image("http://public.codesquad.kr/jk/storeapp/data/detail/HBDEF/6ef14155afc5b47e8c9efd762f7a6096.jpg"
                , "thumbnail"));
        Image thumbnailImage2 = imageRepository.save(new Image("http://public.codesquad.kr/jk/storeapp/data/detail/HBDEF/8744504ff3bc315f901dca1f26fe63a1.jpg"
                , "thumbnail2"));
        Image thumbnailImage3 = imageRepository.save(new Image("http://public.codesquad.kr/jk/storeapp/data/detail/HBDEF/e30bd6de9340fc05db3cd1d1329b2c56.jpg"
                , "thumbnail3"));

        List<BestSidedishDTO> bestSidedishDTOs = SampleDataFactory.createBestSidedishes();
        List<SidedishCategory> sidedishCategories = bestSidedishDTOs.stream()
                .map(BestSidedishDTO::sidedishBestCategory)
                .collect(Collectors.toList());

        for (SidedishCategory sidedishCategory : sidedishCategories) {
            for (Sidedish sidedish : sidedishCategory.getSidedishes()) {
                sidedish.changeImage(image.sidedishImage("재료부터 다른 수제미트볼조림"));
                sidedish.addSidedishThumbImages(Arrays.asList(thumbnailImage1, thumbnailImage2, thumbnailImage3));
            }
        }

        return args -> sidedishCategoryRepository.saveAll(sidedishCategories);
    }

    @Bean
    public ApplicationRunner main(SidedishCategoryRepository sidedishCategoryRepository) {
        SidedishCategory sidedishCategory = sidedishCategoryRepository.save(new SidedishCategory("메인요리", false));
        Image image = imageRepository.save(new Image("http://public.codesquad.kr/jk/storeapp/data/detail/HDF73/0f95f44ea8e2e7930321def493753a48.jpg"
                , "[빅마마의밥친구] 아삭 고소한 연근고기조림 250g"));
        Image thumbnailImage1 = imageRepository.save(new Image("http://public.codesquad.kr/jk/storeapp/data/detail/HDF73/2d408898494ac950d7d2cfd6c36d59c2.jpg"
                , "thumbnail"));
        Image thumbnailImage2 = imageRepository.save(new Image("http://public.codesquad.kr/jk/storeapp/data/detail/HDF73/62c8bb77facfc9c3be81f9bf45b27f2a.jpg"
                , "thumbnail2"));
        Image thumbnailImage3 = imageRepository.save(new Image("http://public.codesquad.kr/jk/storeapp/data/detail/HDF73/f6d73afc0ebc1efa71eaea32e9d846f2.jpg"
                , "thumbnail3"));

        List<SidedishDTO> sidedishDTOs = SampleDataFactory.createMainSidedishes();
        List<Sidedish> sidedishes = sidedishDTOs.stream()
                .map(SidedishDTO::sidedish)
                .collect(Collectors.toList());

        for (Sidedish sidedish : sidedishes) {
            sidedish.changeImage(image.sidedishImage("[빅마마의밥친구] 아삭 고소한 연근고기조림 250g"));
            sidedish.addSidedishThumbImages(Arrays.asList(thumbnailImage1, thumbnailImage2, thumbnailImage3));
        }

        sidedishCategory.addSidedishes(sidedishes);

        return args -> sidedishCategoryRepository.save(sidedishCategory);
    }

    @Bean
    public ApplicationRunner course(SidedishCategoryRepository sidedishCategoryRepository) {
        SidedishCategory sidedishCategory = sidedishCategoryRepository.save(new SidedishCategory("코스요리", false));

        List<SidedishDTO> sidedishDTOs = SampleDataFactory.createCourseSidedishes();
        return getApplicationRunner(sidedishCategoryRepository, sidedishCategory, sidedishDTOs);
    }

    @Bean
    public ApplicationRunner side(SidedishCategoryRepository sidedishCategoryRepository) {
        SidedishCategory sidedishCategory = sidedishCategoryRepository.save(new SidedishCategory("밑반찬", false));
        Image image = imageRepository.save(new Image("http://public.codesquad.kr/jk/storeapp/data/422befe07f7e2860b9a83a8d7049ec2e.jpg"
                , "[미노리키친] 일본식 우엉조림(킨피라고보) 80g"));
        Image thumbnailImage1 = imageRepository.save(new Image("http://public.codesquad.kr/jk/storeapp/data/detail/H602F/edc6bae2e2663f05b4e8eb5a2b95d68f.jpg"
                , "thumbnail"));
        Image thumbnailImage2 = imageRepository.save(new Image("http://public.codesquad.kr/jk/storeapp/data/detail/H602F/c935f5913dc66b11ebceeef85485c438.jpg"
                , "thumbnail2"));
        Image thumbnailImage3 = imageRepository.save(new Image("http://public.codesquad.kr/jk/storeapp/data/detail/H602F/7c1e24867611394f04b37d05593e21ba.jpg"
                , "thumbnail3"));

        List<SidedishDTO> sidedishDTOs = SampleDataFactory.createSideSidedishes();
        List<Sidedish> sidedishes = sidedishDTOs.stream()
                .map(SidedishDTO::sidedish)
                .collect(Collectors.toList());

        for (Sidedish sidedish : sidedishes) {
            sidedish.changeImage(image.sidedishImage("[미노리키친] 일본식 우엉조림(킨피라고보) 80g"));
            sidedish.addSidedishThumbImages(Arrays.asList(thumbnailImage1, thumbnailImage2, thumbnailImage3));
        }

        sidedishCategory.addSidedishes(sidedishes);

        return args -> sidedishCategoryRepository.save(sidedishCategory);
    }

    @Bean
    public ApplicationRunner soup(SidedishCategoryRepository sidedishCategoryRepository) {
        SidedishCategory sidedishCategory = sidedishCategoryRepository.save(new SidedishCategory("국물요리", false));
        Image image = imageRepository.save(new Image("http://public.codesquad.kr/jk/storeapp/data/8fd330b5f5dbccbcbf4f5731e5e9e29b.jpg"
                , "[모이세] 육개장 1팩(600g)"));
        Image thumbnailImage1 = imageRepository.save(new Image("http://public.codesquad.kr/jk/storeapp/data/detail/H26C7/f945d8ac1dccc3f931bcaf35de5de582.jpg"
                , "thumbnail"));
        Image thumbnailImage2 = imageRepository.save(new Image("http://public.codesquad.kr/jk/storeapp/data/detail/H26C7/bacb0b8186371bfafbd92dbeec718e13.jpg"
                , "thumbnail2"));
        Image thumbnailImage3 = imageRepository.save(new Image("http://public.codesquad.kr/jk/storeapp/data/detail/H26C7/b96b02e9a956c6d5ad1e10eb14ba81e0.jpg"
                , "thumbnail3"));

        List<SidedishDTO> sidedishDTOs = SampleDataFactory.createSoupSidedishes();
        List<Sidedish> sidedishes = sidedishDTOs.stream()
                .map(SidedishDTO::sidedish)
                .collect(Collectors.toList());

        for (Sidedish sidedish : sidedishes) {
            sidedish.changeImage(image.sidedishImage("[모이세] 육개장 1팩(600g)"));
            sidedish.addSidedishThumbImages(Arrays.asList(thumbnailImage1, thumbnailImage2, thumbnailImage3));
        }

        sidedishCategory.addSidedishes(sidedishes);

        return args -> sidedishCategoryRepository.save(sidedishCategory);
    }

    private ApplicationRunner getApplicationRunner(SidedishCategoryRepository sidedishCategoryRepository, SidedishCategory sidedishCategory, List<SidedishDTO> sidedishDTOs) {
        Image thumbnailImage1 = imageRepository.findById(6L).get();
        Image thumbnailImage2 = imageRepository.findById(7L).get();
        Image thumbnailImage3 = imageRepository.findById(8L).get();

        List<Sidedish> sidedishes = sidedishDTOs.stream()
                .map(SidedishDTO::sidedish)
                .collect(Collectors.toList());

        for (Sidedish sidedish : sidedishes) {
            sidedish.changeImage(imageRepository.findById(5L).get().sidedishImage("[빅마마의밥친구] 아삭 고소한 연근고기조림 250g"));
            sidedish.addSidedishThumbImages(Arrays.asList(thumbnailImage1, thumbnailImage2, thumbnailImage3));
        }

        sidedishCategory.addSidedishes(sidedishes);

        return args -> sidedishCategoryRepository.save(sidedishCategory);
    }
}
