package com.tibame.timetotravel.view;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "view_company_room")
public class ViewCompanyRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ROOM_ID", nullable = false, insertable = false, updatable = false)
    private Integer roomId;

    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "COM_ACCOUNT", nullable = false)
    private String comAccount;

    @Column(name = "COM_PASSWORD", nullable = false)
    private String comPassword;

    @Column(name = "COM_NAME", nullable = false)
    private String comName;

    @Column(name = "COM_ADDRESS", nullable = false)
    private String comAddress;

    @Column(name = "COM_MANAGER", nullable = false)
    private String comManager;

    @Column(name = "COM_PHONE", nullable = false)
    private String comPhone;

    @Column(name = "COM_TAXID", nullable = false)
    private String comTaxid;

    @Column(name = "COM_SIGNDATE", nullable = false)
    private Timestamp comSigndate;

    @Column(name = "COM_EMAIL", nullable = false)
    private String comEmail;

    @Column(name = "COM_STATUS", nullable = false)
    private Boolean comStatus;

    @Column(name = "COM_LONGITUDE", nullable = false)
    private String comLongitude;

    @Column(name = "COM_LATITUDE", nullable = false)
    private String comLatitude;

    @Column(name = "COM_AVATAR", nullable = false)
    private byte[] comAvatar;

    @Column(name = "COM_NEWS_STATUS", nullable = false)
    private Boolean comNewsStatus;

    @Column(name = "COM_ID", nullable = false)
    private Integer comId;

    @Column(name = "ROOM_NAME", nullable = false)
    private String roomName;

    @Column(name = "ROOM_PRICE", nullable = false)
    private Integer roomPrice;

    @Column(name = "ROOM_DESC", nullable = false)
    private String roomDesc;

    @Column(name = "ROOM_RELEASE", nullable = false)
    private Date roomRelease;

    @Column(name = "ROOM_WIFI", nullable = false)
    private Boolean roomWifi;

    @Column(name = "ROOM_PET", nullable = false)
    private Boolean roomPet;

    @Column(name = "ROOM_BREAKFAST", nullable = false)
    private Boolean roomBreakfast;

    @Column(name = "ROOM_PARKING", nullable = false)
    private Boolean roomParking;

    @Column(name = "ROOM_SMOKING", nullable = false)
    private Boolean roomSmoking;

    @Column(name = "ROOM_24HOURS", nullable = false)
    private Boolean room24Hours;

    @Column(name = "ROOM_STOCK", nullable = false)
    private Integer roomStock;

    @Column(name = "ROOM_BED", nullable = false)
    private String roomBed;

    @Column(name = "ROOM_PEOPLE", nullable = false)
    private Integer roomPeople;

    @Column(name = "ROOM_STATUS", nullable = false)
    private Boolean roomStatus;

    @Column(name = "ROOM_PHOTO", nullable = false)
    private byte[] roomPhoto;
}
