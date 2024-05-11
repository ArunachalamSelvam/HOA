package com.hoa.utils;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.hoa.dto.AddressDTO;
import com.hoa.dto.AmenityDTO;
import com.hoa.dto.AmenityBookingDTO;
import com.hoa.dto.AmenityTypeDTO;
import com.hoa.dto.AuditLogDTO;
import com.hoa.dto.BankDetailDTO;
import com.hoa.dto.ClientAddressDTO;
import com.hoa.dto.ClientDTO;
import com.hoa.dto.CommunityDocumentDTO;
import com.hoa.dto.ContactDTO;
import com.hoa.dto.ContractDTO;
import com.hoa.dto.CommunityDTO;
import com.hoa.dto.CountryDTO;
import com.hoa.dto.DesignationDTO;
import com.hoa.dto.EmailDetailDTO;
import com.hoa.dto.EmailSendToDTO;
import com.hoa.dto.EmployeeDTO;
import com.hoa.dto.EnquiryDTO;
import com.hoa.dto.FaqDTO;
import com.hoa.dto.HoaFeeDTO;
import com.hoa.dto.NewsDTO;
import com.hoa.dto.PageDTO;
import com.hoa.dto.PaymentDetailDTO;
import com.hoa.dto.PlanDTO;
import com.hoa.dto.PlanDetailDTO;
import com.hoa.dto.PlanPeriodDTO;
import com.hoa.dto.PlanRangeDTO;
import com.hoa.dto.PlanTypeDTO;
import com.hoa.dto.RoleDTO;
import com.hoa.dto.RolePageDTO;
import com.hoa.dto.ServiceRequestDTO;
import com.hoa.dto.ServiceRequestNoteDTO;
import com.hoa.dto.ServiceTypeDTO;
import com.hoa.dto.StateDTO;
import com.hoa.dto.UserDTO;
import com.hoa.dto.VendorDTO;
import com.hoa.dto.ViolationDTO;
import com.hoa.dto.ViolationDetailDTO;
import com.hoa.dto.ViolationTypeDTO;
import com.hoa.entities.Address;
import com.hoa.entities.Amenity;
import com.hoa.entities.AmenityBooking;
import com.hoa.entities.AmenityType;
import com.hoa.entities.AuditLog;
import com.hoa.entities.BankDetail;
import com.hoa.entities.Client;
import com.hoa.entities.ClientAddress;
import com.hoa.entities.Community;
import com.hoa.entities.CommunityDocument;
import com.hoa.entities.Contact;
import com.hoa.entities.Contract;
import com.hoa.entities.Country;
import com.hoa.entities.Designation;
import com.hoa.entities.EmailDetail;
import com.hoa.entities.EmailSendTo;
import com.hoa.entities.Employee;
import com.hoa.entities.Enquiry;
import com.hoa.entities.Faq;
import com.hoa.entities.HoaFee;
import com.hoa.entities.News;
import com.hoa.entities.Page;
import com.hoa.entities.PaymentDetail;
import com.hoa.entities.Plan;
import com.hoa.entities.PlanDetail;
import com.hoa.entities.PlanPeriod;
import com.hoa.entities.PlanRange;
import com.hoa.entities.PlanType;
import com.hoa.entities.Role;
import com.hoa.entities.RolePage;
import com.hoa.entities.ServiceRequest;
import com.hoa.entities.ServiceRequestNote;
import com.hoa.entities.ServiceType;
import com.hoa.entities.State;
import com.hoa.entities.User;
import com.hoa.entities.Vendor;
import com.hoa.entities.Violation;
import com.hoa.entities.ViolationDetail;
import com.hoa.entities.ViolationType;

@Component
public class EntityDTOMapper {

	private static final ModelMapper modelMapper = new ModelMapper();

	public ContractDTO toDTO(Contract contract) {
		return modelMapper.map(contract, ContractDTO.class);
	}

	public Contract toEntity(ContractDTO contractDTO) {
		return modelMapper.map(contractDTO, Contract.class);
	}
	
	public RoleDTO toDTO(Role entity) {
		return modelMapper.map(entity, RoleDTO.class);
	}

	public Role toEntity(RoleDTO dto) {
		return modelMapper.map(dto, Role.class);
	}
	
	public UserDTO toDTO(User entity) {
		return modelMapper.map(entity, UserDTO.class);
	}

	public User toEntity(UserDTO dto) {
		return modelMapper.map(dto, User.class);
	}
	
	public AddressDTO toDTO(Address entity) {
		return modelMapper.map(entity, AddressDTO.class);
	}

	public Address toEntity(AddressDTO dto) {
		return modelMapper.map(dto, Address.class);
	}
	
	public AmenityDTO toDTO(Amenity entity) {
        return modelMapper.map(entity, AmenityDTO.class);
    }

    public Amenity toEntity(AmenityDTO dto) {
        return modelMapper.map(dto, Amenity.class);
    }

    public AmenityBookingDTO toDTO(AmenityBooking entity) {
        return modelMapper.map(entity, AmenityBookingDTO.class);
    }

    public AmenityBooking toEntity(AmenityBookingDTO dto) {
        return modelMapper.map(dto, AmenityBooking.class);
    }

    public AmenityTypeDTO toDTO(AmenityType entity) {
        return modelMapper.map(entity, AmenityTypeDTO.class);
    }

    public AmenityType toEntity(AmenityTypeDTO dto) {
        return modelMapper.map(dto, AmenityType.class);
    }

    public AuditLogDTO toDTO(AuditLog entity) {
        return modelMapper.map(entity, AuditLogDTO.class);
    }

    public AuditLog toEntity(AuditLogDTO dto) {
        return modelMapper.map(dto, AuditLog.class);
    }

    public BankDetailDTO toDTO(BankDetail entity) {
        return modelMapper.map(entity, BankDetailDTO.class);
    }

    public BankDetail toEntity(BankDetailDTO dto) {
        return modelMapper.map(dto, BankDetail.class);
    }

    public ClientDTO toDTO(Client entity) {
        return modelMapper.map(entity, ClientDTO.class);
    }

    public Client toEntity(ClientDTO dto) {
        return modelMapper.map(dto, Client.class);
    }

    public ClientAddressDTO toDTO(ClientAddress entity) {
        return modelMapper.map(entity, ClientAddressDTO.class);
    }

    public ClientAddress toEntity(ClientAddressDTO dto) {
        return modelMapper.map(dto, ClientAddress.class);
    }

    public CommunityDTO toDTO(Community entity) {
        return modelMapper.map(entity, CommunityDTO.class);
    }

    public Community toEntity(CommunityDTO dto) {
        return modelMapper.map(dto, Community.class);
    }

    public CommunityDocumentDTO toDTO(CommunityDocument entity) {
        return modelMapper.map(entity, CommunityDocumentDTO.class);
    }

    public CommunityDocument toEntity(CommunityDocumentDTO dto) {
        return modelMapper.map(dto, CommunityDocument.class);
    }
    
    public ContactDTO toDTO(Contact entity) {
        return modelMapper.map(entity, ContactDTO.class);
    }

    public Contact toEntity(ContactDTO dto) {
        return modelMapper.map(dto, Contact.class);
    }


    public CountryDTO toDTO(Country entity) {
        return modelMapper.map(entity, CountryDTO.class);
    }

    public Country toEntity(CountryDTO dto) {
        return modelMapper.map(dto, Country.class);
    }

    public DesignationDTO toDTO(Designation entity) {
        return modelMapper.map(entity, DesignationDTO.class);
    }

    public Designation toEntity(DesignationDTO dto) {
        return modelMapper.map(dto, Designation.class);
    }

    public EmailDetailDTO toDTO(EmailDetail entity) {
        return modelMapper.map(entity, EmailDetailDTO.class);
    }

    public EmailDetail toEntity(EmailDetailDTO dto) {
        return modelMapper.map(dto, EmailDetail.class);
    }

    public EmailSendToDTO toDTO(EmailSendTo entity) {
        return modelMapper.map(entity, EmailSendToDTO.class);
    }

    public EmailSendTo toEntity(EmailSendToDTO dto) {
        return modelMapper.map(dto, EmailSendTo.class);
    }

    public EmployeeDTO toDTO(Employee entity) {
        return modelMapper.map(entity, EmployeeDTO.class);
    }

    public Employee toEntity(EmployeeDTO dto) {
        return modelMapper.map(dto, Employee.class);
    }

    public EnquiryDTO toDTO(Enquiry entity) {
        return modelMapper.map(entity, EnquiryDTO.class);
    }

    public Enquiry toEntity(EnquiryDTO dto) {
        return modelMapper.map(dto, Enquiry.class);
    }

    public FaqDTO toDTO(Faq entity) {
        return modelMapper.map(entity, FaqDTO.class);
    }

    public Faq toEntity(FaqDTO dto) {
        return modelMapper.map(dto, Faq.class);
    }

    public HoaFeeDTO toDTO(HoaFee entity) {
        return modelMapper.map(entity, HoaFeeDTO.class);
    }

    public HoaFee toEntity(HoaFeeDTO dto) {
        return modelMapper.map(dto, HoaFee.class);
    }
    
    public NewsDTO toDTO(News news) {
        return modelMapper.map(news, NewsDTO.class);
    }

    public News toEntity(NewsDTO newsDTO) {
        return modelMapper.map(newsDTO, News.class);
    }

    public PageDTO toDTO(Page page) {
        return modelMapper.map(page, PageDTO.class);
    }

    public Page toEntity(PageDTO pageDTO) {
        return modelMapper.map(pageDTO, Page.class);
    }

    public PaymentDetailDTO toDTO(PaymentDetail paymentDetail) {
        return modelMapper.map(paymentDetail, PaymentDetailDTO.class);
    }

    public PaymentDetail toEntity(PaymentDetailDTO paymentDetailDTO) {
        return modelMapper.map(paymentDetailDTO, PaymentDetail.class);
    }

    public PlanDTO toDTO(Plan plan) {
        return modelMapper.map(plan, PlanDTO.class);
    }

    public Plan toEntity(PlanDTO planDTO) {
        return modelMapper.map(planDTO, Plan.class);
    }
    
    public PlanRangeDTO toDTO(PlanRange planRange) {
        return modelMapper.map(planRange, PlanRangeDTO.class);
    }

    public PlanRange toEntity(PlanRangeDTO planRangeDTO) {
        return modelMapper.map(planRangeDTO, PlanRange.class);
    }
    
    public PlanPeriodDTO toDTO(PlanPeriod planPeriod) {
        return modelMapper.map(planPeriod, PlanPeriodDTO.class);
    }

    public PlanPeriod toEntity(PlanPeriodDTO planPeriodDTO) {
        return modelMapper.map(planPeriodDTO, PlanPeriod.class);
    }
    
    public PlanTypeDTO toDTO(PlanType planType) {
        return modelMapper.map(planType, PlanTypeDTO.class);
    }

    public PlanType toEntity(PlanTypeDTO planTypeDTO) {
        return modelMapper.map(planTypeDTO, PlanType.class);
    }


    public PlanDetailDTO toDTO(PlanDetail planDetail) {
        return modelMapper.map(planDetail, PlanDetailDTO.class);
    }

    public PlanDetail toEntity(PlanDetailDTO planDetailDTO) {
        return modelMapper.map(planDetailDTO, PlanDetail.class);
    }


    public RolePageDTO toDTO(RolePage rolePage) {
        return modelMapper.map(rolePage, RolePageDTO.class);
    }

    public RolePage toEntity(RolePageDTO rolePageDTO) {
        return modelMapper.map(rolePageDTO, RolePage.class);
    }

    public ServiceRequestDTO toDTO(ServiceRequest serviceRequest) {
        return modelMapper.map(serviceRequest, ServiceRequestDTO.class);
    }

    public ServiceRequest toEntity(ServiceRequestDTO serviceRequestDTO) {
        return modelMapper.map(serviceRequestDTO, ServiceRequest.class);
    }

    public ServiceRequestNoteDTO toDTO(ServiceRequestNote serviceRequestNote) {
        return modelMapper.map(serviceRequestNote, ServiceRequestNoteDTO.class);
    }

    public ServiceRequestNote toEntity(ServiceRequestNoteDTO serviceRequestNoteDTO) {
        return modelMapper.map(serviceRequestNoteDTO, ServiceRequestNote.class);
    }

    public ServiceTypeDTO toDTO(ServiceType serviceType) {
        return modelMapper.map(serviceType, ServiceTypeDTO.class);
    }

    public ServiceType toEntity(ServiceTypeDTO serviceTypeDTO) {
        return modelMapper.map(serviceTypeDTO, ServiceType.class);
    }

    public StateDTO toDTO(State state) {
        return modelMapper.map(state, StateDTO.class);
    }

    public State toEntity(StateDTO stateDTO) {
        return modelMapper.map(stateDTO, State.class);
    }

    public VendorDTO toDTO(Vendor vendor) {
        return modelMapper.map(vendor, VendorDTO.class);
    }

    public Vendor toEntity(VendorDTO vendorDTO) {
        return modelMapper.map(vendorDTO, Vendor.class);
    }

    public ViolationDTO toDTO(Violation violation) {
        return modelMapper.map(violation, ViolationDTO.class);
    }

    public Violation toEntity(ViolationDTO violationDTO) {
        return modelMapper.map(violationDTO, Violation.class);
    }

    public ViolationDetailDTO toDTO(ViolationDetail violationDetail) {
        return modelMapper.map(violationDetail, ViolationDetailDTO.class);
    }

    public ViolationDetail toEntity(ViolationDetailDTO violationDetailDTO) {
        return modelMapper.map(violationDetailDTO, ViolationDetail.class);
    }

    public ViolationTypeDTO toDTO(ViolationType violationType) {
        return modelMapper.map(violationType, ViolationTypeDTO.class);
    }

    public ViolationType toEntity(ViolationTypeDTO violationTypeDTO) {
        return modelMapper.map(violationTypeDTO, ViolationType.class);
    }
}
